create table test.rio_req_detail(
   rio_req_no   int  not null,
   rio_req_line   int  not null,
   inproc_ref_type   int  not null,
   inproc_ref_no   int  not null,
   hold_qty   int  not null,
   entry_id   int  not null,
   entry_datetime   datetime  not null,
   inproc_ref_line   int  null,
   fixed   varchar(1)  null,
   primary key(rio_req_no, rio_req_line)
)

--create unique clustered index rio_req_detailI1 on dbo.rio_req_detail ( rio_req_no ASC,rio_req_line ASC)
--create nonclustered index rio_req_detailI2 on dbo.rio_req_detail ( inproc_ref_type ASC,inproc_ref_no ASC,inproc_ref_line ASC)