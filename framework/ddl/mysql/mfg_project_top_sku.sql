create table test.mfg_project_top_sku(
   material_list_id   int  primary key auto_increment,
   mfg_proj_ref_no   varchar(30)  null,
   top_sku_no   int  not null,
   h_version   int  DEFAULT   0 
    not null,
   entry_id   int  not null,
   entry_datetime   datetime  not null,
   prod_lead_time   int  null,
   mfg_proj_id   int  DEFAULT   -1 
    not null
)