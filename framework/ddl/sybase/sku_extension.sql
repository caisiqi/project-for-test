create table dbo.sku_extension(
   sku_no   int  not null,
   u_version   char(1)  null,
   rt_type   char(1)  null,
   all_rt   float  null,
   sellable   float  null,
   defective   float  null,
   lip_date   datetime  null,
   no_bo_cancel   char(1)  null,
   pp_days   int  null,
   upc_req   char(1)  null,
   weight_req   char(1)  null,
   retail_price_req   char(1)  null,
   effective_date   datetime  null,
   entry_id   int  null,
   entry_datetime   datetime  null,
   issue_policy   char(1)  null,
   design_group   int  null,
   unit_measure   varchar(4)  null,
   routing_code   varchar(10)  null,
   rank_flag   char(1)  null,
   rt_per_con   float  null,
   rt_per_openbox   float  null,
   rt_per_combine   float  null,
   prod_life_cycle   varchar(10)  null,
   complete_flag   char(1)  null,
   sys_type   int  null,
   cust_platform   varchar(60)  null,
   server_no   int  null
)
alter table sku_extension lock allpages
go

grant references on sku_extension
   to public /*dbo*/
grant select on sku_extension
   to public /*dbo*/
grant insert on sku_extension
   to cis /*dbo*/
grant delete on sku_extension
   to cis /*dbo*/
grant update on sku_extension
   to cis /*dbo*/
create unique clustered index sku_extension1 on dbo.sku_extension ( sku_no ASC)