create table test.mfg_project_forecast(
   fcst_id   int  primary key auto_increment,
   mfg_proj_id   int  not null,
   top_sku_no   int  not null,
   fcst_qty   int  not null,
   fcst_date   datetime  not null,
   entry_datetime   datetime  not null,
   entry_id   int  not null,
   update_datetime   datetime  null,
   update_id   int  null,
   h_version   int  DEFAULT  0
	  not null,
   demand_type   int  DEFAULT  1
  not null
)
--create unique clustered index mfg_project_forecastI1 on dbo.mfg_project_forecast ( mfg_proj_id ASC,top_sku_no ASC,fcst_date ASC,demand_type ASC)
--	with DEFAULT  1
--
--create unique nonclustered index mfg_project_forecastI2 on dbo.mfg_project_forecast ( fcst_id ASC)
--	with DEFAULT  1
