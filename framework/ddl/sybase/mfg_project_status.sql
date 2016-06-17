create table dbo.mfg_project_status(
   mfg_proj_stat_id   int  identity,
   mfg_proj_id   int  not null,
   status   varchar(20)  null,
   comment   varchar(100)  null,
   assigned_signer   varchar(100)  null,
   arrival_datetime   datetime  not null,
   signer_id   int  null,
   sign_datetime   datetime  null,
   budget   money  null,
   h_version   int  DEFAULT   0 
    not null,
   chg_form_no   int  null
)
alter table mfg_project_status lock allpages
go

grant references on mfg_project_status
   to public /*dbo*/
grant select on mfg_project_status
   to public /*dbo*/
grant insert on mfg_project_status
   to cis /*dbo*/
grant delete on mfg_project_status
   to cis /*dbo*/
grant update on mfg_project_status
   to cis /*dbo*/
create clustered index mfg_project_statusI1 on dbo.mfg_project_status ( mfg_proj_id ASC)
create unique nonclustered index mfg_project_statusI2 on dbo.mfg_project_status ( mfg_proj_stat_id ASC)