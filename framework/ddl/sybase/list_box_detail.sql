create table dbo.list_box_detail(
   list_box_code   char(4)  not null,
   code_value   char(30)  not null,
   u_version   char(1)  not null,
   code_desc   varchar(300)  not null,
   entry_datetime   datetime  not null,
   entry_id   int  not null,
   delete_datetime   datetime  null,
   delete_id   int  null,
   sequence   int  null,
   activeFlag   char(1)  DEFAULT   'Y' 
    not null,
   key1   int  null,
   ref1   int  null,
   ref2   int  null
)
alter table list_box_detail lock allpages
go

grant references on list_box_detail
   to public /*dbo*/
grant select on list_box_detail
   to public /*dbo*/
grant insert on list_box_detail
   to  /*dbo*/
grant delete on list_box_detail
   to  /*dbo*/
grant update on list_box_detail
   to  /*dbo*/
create unique clustered index list_box_detail_idx on dbo.list_box_detail ( list_box_code ASC,code_value ASC)