create table test.mfg_project_status(
   mfg_proj_stat_id   int  primary key auto_increment,
   mfg_proj_id   int  not null,
   status   varchar(20)  null,
   comment   varchar(100)  null,
   assigned_signer   varchar(100)  null,
   arrival_datetime   datetime  not null,
   signer_id   int  null,
   sign_datetime   datetime  null,
   budget   double  null,
   h_version   int  DEFAULT   0 
    not null,
   chg_form_no   int  null
)

--create clustered index mfg_project_statusI1 on dbo.mfg_project_status ( mfg_proj_id ASC)
--create unique nonclustered index mfg_project_statusI2 on dbo.mfg_project_status ( mfg_proj_stat_id ASC)