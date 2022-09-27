create table DC_PROPERTY
(
    ID          VARCHAR2(300) not null
        constraint PROPERTY_PK
            primary key,
    CONFIG_ID   VARCHAR2(300) not null,
    VALUE       VARCHAR2(300) not null,
    DESCRIPTION VARCHAR2(300),
    ORDER_SEQ   NUMBER(22) default 10,
    REMARK      VARCHAR2(1000),
    IS_ENABLE   NUMBER(1)  default 1,
    CODE        VARCHAR2(300)
)
/

comment on table DC_PROPERTY is '属性值'
/

comment on column DC_PROPERTY.CONFIG_ID is '所属系统配置ID，取自CONFIG表.ID'
/

comment on column DC_PROPERTY.VALUE is '值'
/

comment on column DC_PROPERTY.DESCRIPTION is '描述'
/

comment on column DC_PROPERTY.ORDER_SEQ is '排序号'
/

comment on column DC_PROPERTY.REMARK is '备注'
/

comment on column DC_PROPERTY.IS_ENABLE is '是否启用'
/

create unique index DC_PROPERTY_CODE_CONFIG_ID_UINDEX
    on DC_PROPERTY (CODE, CONFIG_ID)
/

