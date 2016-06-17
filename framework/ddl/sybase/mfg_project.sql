create table dbo.mfg_project(
   mfg_proj_id   int  identity,
   mfg_proj_ref_no   varchar(30)  not null,
   cust_no   int  not null,
   h_version   int  DEFAULT   0 
    not null,
   start_date   datetime  not null,
   end_date   datetime  not null,
   entry_id   int  not null,
   entry_datetime   datetime  not null,
   loc_no   int  null,
   approved_budget   money  null,
   status   varchar(20)  null,
   signer_id   int  null,
   sign_datetime   datetime  null,
   comment   varchar(100)  null,
   auto_release_flag   char(1)  null,
   chg_status   varchar(20)  null,
   margin   money  DEFAULT  0
  not null,
   adv_fcst   char(1)  null,
   pool_flag   char(1)  null,
   cust_fcst   char(1)  DEFAULT  'N'
  not null,
   project_type   char(1)  DEFAULT  'M'
  not null,
   auto_bom   char(1)  DEFAULT  'N'
      not null,
   standalone   char(1)  DEFAULT  'Y'
  not null
)
alter table mfg_project lock allpages
go

grant references on mfg_project
   to public /*dbo*/
grant select on mfg_project
   to public /*dbo*/
grant insert on mfg_project
   to cis /*dbo*/
grant delete on mfg_project
   to cis /*dbo*/
grant update on mfg_project
   to cis /*dbo*/
create unique clustered index mfg_projectI1 on dbo.mfg_project ( mfg_proj_ref_no ASC)
	with DEFAULT  'Y'

create nonclustered index mfg_projectI2 on dbo.mfg_project ( cust_no ASC,mfg_proj_ref_no ASC,loc_no ASC)
	with DEFAULT  'Y'

create unique nonclustered index mfg_projectI3 on dbo.mfg_project ( mfg_proj_id ASC)
	with DEFAULT  'Y'
