create table sys_dic (
  dic_key                       varchar(255) not null,
  description                   varchar(255),
  value                         varchar(255),
  constraint pk_sys_dic primary key (dic_key)
);

create table sys_resource (
  id                            bigint auto_increment not null,
  type                          integer,
  name                          varchar(255),
  permission                    varchar(255),
  sort                          bigint,
  url                           varchar(255),
  description                   varchar(255),
  status                        bigint,
  parent_id                     bigint,
  create_by                     bigint,
  create_at                     datetime(6),
  update_by                     bigint,
  update_at                     bigint,
  constraint ck_sys_resource_type check (type in (0,1,2)),
  constraint pk_sys_resource primary key (id)
);

create table sys_role (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  role                          varchar(255),
  remark                        varchar(255),
  status                        integer,
  parent_id                     bigint,
  create_by_id                  bigint,
  create_at                     datetime(6),
  update_by_id                  bigint,
  update_at                     datetime(6),
  constraint pk_sys_role primary key (id)
);

create table sys_user (
  id                            bigint auto_increment not null,
  mobile_phone                  varchar(255),
  user_name                     varchar(255),
  nickname                      varchar(255),
  password                      varchar(255),
  salt                          varchar(255),
  signature                     varchar(255),
  gender                        tinyint(1) default 0,
  qq                            bigint,
  email                         varchar(255),
  avatar                        varchar(255),
  province                      varchar(255),
  city                          varchar(255),
  reg_ip                        varchar(255),
  score                         integer,
  status                        integer,
  create_by                     bigint,
  create_at                     datetime(6),
  update_by                     bigint,
  update_at                     datetime(6),
  constraint pk_sys_user primary key (id)
);

alter table sys_role add constraint fk_sys_role_create_by_id foreign key (create_by_id) references sys_user (id) on delete restrict on update restrict;
create index ix_sys_role_create_by_id on sys_role (create_by_id);

alter table sys_role add constraint fk_sys_role_update_by_id foreign key (update_by_id) references sys_user (id) on delete restrict on update restrict;
create index ix_sys_role_update_by_id on sys_role (update_by_id);

