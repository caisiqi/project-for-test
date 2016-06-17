create table sku_profile(
   sku_no   int  not null,
   profile_type   char(10)  not null,
   profile_cat   char(4)  not null,
   u_version   char(1)  not null,
   profile_c   varchar(80)  null,
   profile_i   int  null,
   profile_f   float  null,
   profile_d   datetime  null,
   active   char(1)  not null,
   entry_datetime   datetime  not null,
   entry_id   int  not null,
   primary key (sku_no, profile_type, profile_cat)
)
--alter table sku_profile lock allpages
--go
--
--grant references on sku_profile
--   to public /*dbo*/
--grant select on sku_profile
--   to public /*dbo*/
--grant insert on sku_profile
--   to cis /*dbo*/
--grant delete on sku_profile
--   to cis /*dbo*/
--grant update on sku_profile
--   to cis /*dbo*/
--create unique clustered index sku_profileI1 on dbo.sku_profile ( sku_no ASC,profile_type ASC,profile_cat ASC)
--create nonclustered index sku_profileI2 on dbo.sku_profile ( profile_type ASC,active ASC)
--create nonclustered index sku_profileI3 on dbo.sku_profile ( profile_i ASC)