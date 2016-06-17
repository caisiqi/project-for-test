package oliver.test.service;

import java.util.Properties;

import javax.ejb.Stateless;

import org.apache.openejb.config.EjbModule;
import org.apache.openejb.jee.EjbJar;
import org.apache.openejb.jee.StatelessBean;
import org.apache.openejb.jee.oejb3.EjbDeployment;
import org.apache.openejb.jee.oejb3.OpenejbJar;
import org.apache.openejb.junit.ApplicationComposer;
import org.apache.openejb.testing.Module;
import org.dbunit.DBTestCase;
import org.dbunit.dataset.IDataSet;
import org.junit.runner.RunWith;

@RunWith(ApplicationComposer.class)
public class EjbServiceTest {

	@Module
    public EjbModule app() {
        final StatelessBean bean = (StatelessBean) new StatelessBean(EjbBean.class).localBean();
        // 设置启用restful服务
        //bean.setRestService(true);
        final EjbJar ejbJar = new EjbJar();
        ejbJar.addEnterpriseBean(bean);
        final OpenejbJar openejbJar = new OpenejbJar();
        openejbJar.addEjbDeployment(new EjbDeployment(ejbJar.getEnterpriseBeans()[0]));
        final Properties properties = openejbJar.getEjbDeployment().iterator().next().getProperties();
        // Not Completed
        properties.setProperty("", "");
        final EjbModule module = new EjbModule(ejbJar);
        module.setOpenejbJar(openejbJar);
        return module;
    }
	
	public static interface EjbService{ public void service(); }
	
	@Stateless(name = "oliver/demo/EjbBean")
	public static class EjbBean implements EjbService{

		@Override
		public void service() {
			System.out.println(String.format("[%s] is in service", EjbBean.class.getSimpleName()));
		}
	}
	
	public static class MyDBTestCase extends DBTestCase{

		@Override
		protected IDataSet getDataSet() throws Exception {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
	
}
