create table dbo.part_master(
   sku_no   int  not null,
   u_version   char(1)  null,
   category_id   int  null,
   series_no   int  null,
   part_no   varchar(20)  not null,
   short_desc   varchar(40)  null,
   long_desc   varchar(255)  null,
   catalog_desc   varchar(255)  null,
   ave_cost   money  null,
   std_cost   money  null,
   cost_meth   char(1)  null,
   abc_code   varchar(1)  null,
   prod_code   int  null,
   prod_type   char(1)  null,
   weight   float  null,
   cu_height   float  null,
   cu_width   float  null,
   cu_length   float  null,
   entry_datetime   datetime  null,
   entry_id   int  null,
   ser_no_flag   char(1)  null,
   avail_to_sell   char(1)  null,
   active_status   char(1)  null,
   accept_rma   char(1)  null,
   production_flag   char(1)  null,
   po_cost   money  null,
   vend_no   int  null,
   pur_comment   varchar(255)  null,
   pur_end_date   datetime  null,
   mar_comment   varchar(255)  null,
   mar_end_date   datetime  null,
   shortage   char(1)  null,
   upc_code   varchar(20)  null,
   fixed_price   money  null,
   sug_retail_price   money  null,
   reorder_level   int  null,
   reorder_qty   int  null,
   package_qty   int  null,
   wgt_chk_date   datetime  null,
   mrp_date   datetime  null,
   security   char(1)  null,
   wms_profile   char(3)  null,
   lifecycle_status   char(2)  null,
   source_status   char(2)  null,
   usage_type   char(2)  null,
   mfg_partno   varchar(30)  null,
   mult   int  null,
   min_poqty   int  null,
   master_flag   char(1)  null,
   group_id   int  null,
   model   varchar(40)  null,
   vpl_no   int  null,
   active_status_date   datetime  null,
   last_pur_date   datetime  null,
   prod_lifecycle_code   varchar(2)  null,
   bundle_kit   char(1)  null
)
alter table part_master lock allpages
go

grant references on part_master
   to public /*dbo*/
grant select on part_master
   to public /*dbo*/
grant insert on part_master
   to cis /*dbo*/
grant delete on part_master
   to cis /*dbo*/
grant update on part_master
   to cis /*dbo*/
create unique clustered index part_masterI1 on dbo.part_master ( sku_no ASC)
create nonclustered index part_masterI10 on dbo.part_master ( group_id ASC)
create nonclustered index part_masterI11 on dbo.part_master ( mfg_partno ASC)
create nonclustered index part_masterI12 on dbo.part_master ( vpl_no ASC)
create nonclustered index part_masterI13 on dbo.part_master ( model ASC)
create nonclustered index part_masterI14 on dbo.part_master ( abc_code ASC,accept_rma ASC)
create nonclustered index part_masterI3 on dbo.part_master ( prod_code ASC)
create nonclustered index part_masterI5 on dbo.part_master ( category_id ASC)
create nonclustered index part_masterI6 on dbo.part_master ( series_no ASC)
create nonclustered index part_masterI7 on dbo.part_master ( upc_code ASC)
create nonclustered index part_masterI9 on dbo.part_master ( entry_datetime ASC)
create unique nonclustered index part_masterI2 on dbo.part_master ( part_no ASC)
create nonclustered index part_masterI4 on dbo.part_master ( vend_no ASC,active_status ASC)
create nonclustered index part_masterI8 on dbo.part_master ( vend_no ASC,prod_code ASC)