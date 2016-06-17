create table dbo.order_profile(
   order_type   int  not null,
   order_no   int  not null,
   profile_no   int  not null,
   profile_type   char(10)  not null,
   profile_cat   char(4)  not null,
   u_version   char(1)  not null,
   order_line_no   int  null,
   profile_c   varchar(110)  null,
   profile_i   int  null,
   profile_f   float  null,
   profile_d   datetime  null,
   active   char(1)  not null,
   entry_datetime   datetime  not null,
   entry_id   int  not null,
   h_version   int  DEFAULT   0 

    not null
)
alter table order_profile lock datarows
go

grant references on order_profile
   to public /*dbo*/
grant select on order_profile
   to public /*dbo*/
grant insert on order_profile
   to cis /*dbo*/
grant delete on order_profile
   to cis /*dbo*/
grant update on order_profile
   to cis /*dbo*/
create unique clustered index order_profileI1 on dbo.order_profile ( order_no ASC,profile_type ASC,profile_no ASC,order_type ASC,profile_cat ASC)
	with DEFAULT   0 


create nonclustered index order_profileI2 on dbo.order_profile ( profile_type ASC,profile_cat ASC)
	with DEFAULT   0 

