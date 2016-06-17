create table dbo.mfg_project_planning_bom(
   tree_id   int  identity,
   top_sku_no   int  not null,
   mfg_proj_id   int  not null,
   parent_id   int  DEFAULT  -1
	  not null,
   sku_no   int  not null,
   line_no   varchar(20)  not null,
   prebuild   char(1)  null,
   comp_qty   int  not null,
   entry_datetime   datetime  not null,
   entry_id   int  not null,
   update_datetime   datetime  null,
   update_id   int  null,
   h_version   int  DEFAULT  0
	  not null,
   status   varchar(10)  null,
   priority   int  null,
   alter_percentage   float  null,
   alloc_model   int  null,
   group_name   varchar(30)  null,
   pr   varchar(1)  DEFAULT  'Y'

  not null,
   expanded_bom_qty   int  null,
   life_cycle   varchar(20)  null,
   spare_qty   int  DEFAULT  0
	  not null,
   spare_percentage   money  null
)
alter table mfg_project_planning_bom lock allpages
go

grant references on mfg_project_planning_bom
   to public /*dbo*/
grant select on mfg_project_planning_bom