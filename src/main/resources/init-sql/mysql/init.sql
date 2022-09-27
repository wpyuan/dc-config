-- 系统配置
create table dc_config
(
    id          varchar(300)         not null
        primary key,
    code        varchar(300)         not null comment '代码',
    description varchar(1000)        null comment '描述',
    is_enable   tinyint(1) default 1 null comment '是否启用',
    constraint dc_config_code_uindex
        unique (code)
)
comment '系统配置';

-- 属性值
create table dc_property
(
    id varchar(300) not null,
    config_id varchar(300) not null comment '所属系统配置id，取自config表.id',
    code varchar(300) null comment '代码',
    value varchar(300) not null comment '值',
    description varchar(300) null comment '描述',
    order_seq int default 10 null comment '排序号',
    remark longtext null comment '备注',
    is_enable tinyint(1) default 1 null comment '是否启用',
    constraint property_pk
        primary key (id)
)
comment '属性值';

create unique index dc_property_code_config_id_uindex
    on dc_property (code, config_id);
