create table test.order_header(
   order_type   int  not null,
   order_no   int  not null,
   u_version   char(1)  null,
   from_acct_no   int  null,
   from_loc_no   int  null,
   from_contact_no   int  null,
   from_dept_no   int  null,
   from_inv_type   int  null,
   to_acct_no   int  null,
   to_loc_no   int  null,
   to_contact_no   int  null,
   to_dept_no   int  null,
   to_inv_type   int  null,
   ship_to_name   varchar(50)  null,
   ship_to_addr   varchar(60)  null,
   ship_to_po_box   varchar(60)  null,
   ship_to_city   varchar(60)  null,
   ship_to_state   varchar(2)  null,
   ship_to_country   varchar(20)  null,
   ship_to_zip   varchar(10)  null,
   account_rep   int  null,
   mt_expense_code   char(4)  null,
   int_ref_no   int  null,
   int_ref_type   int  null,
   ext_ref   varchar(20)  null,
   issue_date   datetime  null,
   credit_rel_date   datetime  null,
   pick_date   datetime  null,
   manifest_date   datetime  null,
   ship_date   datetime  null,
   invoice_date   datetime  null,
   posting_date   datetime  null,
   expected_date   datetime  null,
   receiving_date   datetime  null,
   closed_date   datetime  null,
   printed_date   datetime  null,
   delete_date   datetime  null,
   terms_no   char(4)  null,
   carrier_no   int  null,
   ship_method   char(4)  null,
   freight   varchar(1)  null,
   resale   varchar(1)  null,
   sales_terr   int  null,
   credit_rel_code   varchar(1)  null,
   it_cost_code   int  null,
   sales_tax   double  null,
   entry_datetime   datetime  null,
   entry_id   int  null,
   total_order   double  null,
   total_cost   double  null,
   sales_total   double  null,
   head_exp_total   double  null,
   sales_rel_date   datetime  null,
   delete_id   int  null,
   detail_exp_total   double  null,
   rma_disp_type   varchar(4)  null,
   repick_id   int  null,
   repick_counter   int  null,
   invoice_id   int  null,
   invoice_counter   int  null,
   total_weight   double  null,
   hold_date   datetime  null,
   hold_id   int  null,
   drop_ship   char(1)  null,
   detail_price_total   double  null,
   ship_to_loc   int  null,
   ship_to_loc_change   int  null,
   q_userid   int  null,
   label_printed   char(1)  null,
   label_date   datetime  null,
   dist_exp_date   datetime  null,
   prod_exp_date   datetime  null,
   bol_date   datetime  null,
   bol_printed   char(1)  null,
   qc_date   datetime  null,
   schedule_date   datetime  null,
   approval   varchar(20)  null,
   fx_total_order   double  null,
   fx_total_cost   double  null,
   fx_sales_total   double  null,
   fx_head_exp_total   double  null,
   fx_detail_exp_total   double  null,
   fx_detail_price_total   double  null,
   h_version   int  DEFAULT   0
    not null,
   profile_special_handle   char(1)  null,
   fx_currency   char(3)  null,
   primary key (order_no, order_type)
)