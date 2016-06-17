package oliver.demo.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import oliver.demo.dao.sybase.ConfigDao;

public class ConfigServiceImpl implements ConfigService {

	@Autowired
	private ConfigDao configDao;
	
	@SuppressWarnings("rawtypes")
	@Override
	public Map getFTPConfig() {
		return configDao.getFTPConfig();
	}

}
