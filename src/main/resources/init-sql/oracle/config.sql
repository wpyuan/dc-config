create table DC_CONFIG
(
    ID          VARCHAR2(300) not null
        constraint CONFIG_PK
        primary key,
    CODE        VARCHAR2(300) not null,
    DESCRIPTION VARCHAR2(1000),
    IS_ENABLE   NUMBER(1) default 1
)
    /

comment on table DC_CONFIG is '系统配置'
/

comment on column DC_CONFIG.CODE is '代码'
/

comment on column DC_CONFIG.DESCRIPTION is '描述'
/

comment on column DC_CONFIG.IS_ENABLE is '是否启用'
/

create unique index DC_CONFIG_CODE_UINDEX
    on DC_CONFIG (CODE)
/

