create table dbo.rio_request_header(
   rio_req_no   int  identity,
   sku_no   int  not null,
   loc_no   int  not null,
   req_qty   int  not null,
   cust_no   int  null,
   agent_no   int  null,
   hold_auth_no   varchar(20)  null,
   entry_id   int  not null,
   entry_datetime   datetime  not null,
   reason   varchar(255)  null,
   status   char(1)  not null,
   type   char(1)  null,
   approve_id   int  null,
   approved_qty   int  null,
   approve_datetime   datetime  null,
   pending_qty   int  null,
   expected_inv_date   datetime  null,
   end_date   datetime  null,
   vpl_no   int  null,
   reject_reason   varchar(100)  null,
   kit_flag   char(1)  null,
   update_enddate_flag   char(1)  null,
   group_id   int  null,
   rio_parent_id   int  null,
   ref_descr   varchar(30)  null,
   forecast_source   varchar(10)  null,
   update_id   int  null,
   update_reason   varchar(255)  null
)
alter table rio_request_header lock datarows
go

grant references on rio_request_header
   to public /*dbo*/
grant select on rio_request_header
   to public /*dbo*/
grant insert on rio_request_header
   to cis /*dbo*/
grant delete on rio_request_header
   to cis /*dbo*/
grant update on rio_request_header
   to cis /*dbo*/
create nonclustered index rio_request_headerI2 on dbo.rio_request_header ( cust_no ASC,hold_auth_no ASC,sku_no ASC,loc_no ASC)
create nonclustered index rio_request_headerI3 on dbo.rio_request_header ( expected_inv_date ASC)
create nonclustered index rio_request_headerI4 on dbo.rio_request_header ( vpl_no ASC)
create nonclustered index rio_request_headerI5 on dbo.rio_request_header ( sku_no ASC,loc_no ASC,cust_no ASC)
create unique clustered index rio_request_headerI1 on dbo.rio_request_header ( rio_req_no ASC)