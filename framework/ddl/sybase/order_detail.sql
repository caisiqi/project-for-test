create table dbo.order_detail(
   order_type   int  not null,
   order_no   int  not null,
   order_line_no   int  not null,
   u_version   char(1)  null,
   vend_part_no   varchar(30)  null,
   loc_no   int  null,
   inv_type   int  null,
   sku_no   int  null,
   order_qty   int  null,
   ship_qty   int  null,
   rec_qty   int  null,
   unit_cost   money  null,
   unit_price   money  null,
   close_date   datetime  null,
   expected_date   datetime  null,
   rec_date   datetime  null,
   delete_date   datetime  null,
   entry_datetime   datetime  null,
   entry_id   int  null,
   int_ref_type   int  null,
   int_ref_no   int  null,
   int_ref_line_no   int  null,
   ext_ref   varchar(20)  null,
   sys_old_cost   money  null,
   sys_new_cost   money  null,
   claim_old_cost   money  null,
   claim_new_cost   money  null,
   delete_id   int  null,
   kit_line_no   int  null,
   cc_loc_no   int  null,
   release_id   int  null,
   release_date   datetime  null,
   reqd_comp   char(1)  null,
   dist_exp_date   datetime  null,
   prod_exp_date   datetime  null,
   pr_description   varchar(255)  null,
   gl_acct_no   int  null,
   h_version   int  DEFAULT   0 

    not null,
   sub_kit_line_no   int  null
)
alter table order_detail lock datarows
go

grant references on order_detail
   to public /*dbo*/
grant select on order_detail
   to public /*dbo*/
grant insert on order_detail
   to cis /*dbo*/
grant delete on order_detail
   to cis /*dbo*/
grant update on order_detail
   to cis /*dbo*/
create unique clustered index order_detailI1 on dbo.order_detail ( order_no ASC,order_type ASC,order_line_no ASC)
create nonclustered index order_detailI6 on dbo.order_detail ( order_type ASC)
create nonclustered index order_detailI3 on dbo.order_detail ( sku_no ASC,inv_type ASC)
create nonclustered index order_detailI5 on dbo.order_detail ( int_ref_no ASC,int_ref_line_no ASC)
create nonclustered index order_detailI13 on dbo.order_detail ( vend_part_no ASC,sku_no ASC)