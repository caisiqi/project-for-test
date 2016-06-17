create table dbo.mfg_project_top_sku(
   material_list_id   int  identity,
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
alter table mfg_project_top_sku lock allpages
go

grant references on mfg_project_top_sku
   to public /*dbo*/
grant select on mfg_project_top_sku
   to public /*dbo*/
grant insert on mfg_project_top_sku
   to cis /*dbo*/
grant delete on mfg_project_top_sku
   to cis /*dbo*/
grant update on mfg_project_top_sku
   to cis /*dbo*/
create clustered index mfg_project_top_skuI1 on dbo.mfg_project_top_sku ( mfg_proj_id ASC,top_sku_no ASC)
	with DEFAULT   -1 

create unique nonclustered index mfg_project_top_skuI2 on dbo.mfg_project_top_sku ( material_list_id ASC)
	with DEFAULT   -1 
