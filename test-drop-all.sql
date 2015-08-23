alter table sys_role drop foreign key fk_sys_role_create_by_id;
drop index ix_sys_role_create_by_id on sys_role;

alter table sys_role drop foreign key fk_sys_role_update_by_id;
drop index ix_sys_role_update_by_id on sys_role;

drop table if exists sys_dic;

drop table if exists sys_resource;

drop table if exists sys_role;

drop table if exists sys_user;

