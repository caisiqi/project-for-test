create table test.location_info(
   loc_no   int  not null primary key,
   u_version   char(1)  null,
   loc_name   varchar(20)  null,
   loc_addr   varchar(60)  null,
   loc_pobox   varchar(30)  null,
   loc_city   varchar(30)  null,
   loc_state   char(2)  null,
   loc_zip_code   varchar(10)  null,
   company_no   int  not null,
   entry_datetime   datetime  null,
   entry_id   int  null,
   loc_char   char(4)  null,
   whse_flag   char(1)  null,
   atm_flag   char(1)  null,
   hit   int  null,
   miss   int  null,
   priority   int  null,
   country_code   char(2)  null,
   frt_loc_no   int  null,
   phy_distr_wh   char(1)  null,
   agg_loc_no_vend   int  null,
   agg_loc_no_1src   int  null,
   geo_zone   char(4)  null,
   cutoff_time   char(8)  null,
   frt_account   varchar(9)  null,
   frt_meter   char(7)  null,
   flag   char(1)  null,
   description   varchar(40)  null,
   server_ip   varchar(20)  null,
   master_meter   char(1)  null,
   master_acct   char(1)  null,
   ups_account   varchar(20)  null,
   fdxgnd_account   varchar(20)  null,
   ext_type   char(2)  null,
   ext_no   int  null,
   ext_loc_no   int  null
)
--create unique clustered index location_infoI1 on dbo.location_info ( loc_no ASC)
--create nonclustered index location_infoI4 on dbo.location_info ( ext_loc_no ASC)
--create nonclustered index location_infoI5 on dbo.location_info ( ext_no ASC,ext_loc_no ASC)
--create nonclustered index location_infoI2 on dbo.location_info ( company_no ASC)
--create nonclustered index location_infoI3 on dbo.location_info ( loc_char ASC)