create table dbo.cust_part_no(
   cust_no   int  not null,
   cust_part_no   varchar(40)  not null,
   synnex_sku_no   int  null,
   entry_datetime   datetime  null,
   delete_datetime   datetime  null,
   entry_id   int  null,
   delete_id   int  null,
   retail_price   money  null,
   cust_part_no2   varchar(30)  null
)
alter table cust_part_no lock allpages
go

grant references on cust_part_no
   to public /*dbo*/
grant select on cust_part_no
   to public /*dbo*/
grant insert on cust_part_no
   to cis /*dbo*/
grant delete on cust_part_no
   to cis /*dbo*/
grant update on cust_part_no
   to cis /*dbo*/
create unique clustered index cust_part_noI1 on dbo.cust_part_no ( cust_no ASC,cust_part_no ASC)
create nonclustered index cust_part_noI2 on dbo.cust_part_no ( synnex_sku_no ASC,cust_no ASC)
create nonclustered index cust_part_noI3 on dbo.cust_part_no ( cust_part_no ASC)
create nonclustered index cust_part_noI4 on dbo.cust_part_no ( cust_part_no2 ASC)