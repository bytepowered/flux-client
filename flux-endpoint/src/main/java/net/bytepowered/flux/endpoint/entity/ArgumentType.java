package net.bytepowered.flux.endpoint.entity;

/**
 * 参数类型
 *
 * @author 陈哈哈 yongjia.chen@hotmail.com
 */
public enum ArgumentType {

    /**
     * 基础字段类型。表示当前参数是Java基础类型，没有内部成员字段。
     */
    PRIMITIVE,

    /**
     * POJO类型。表示内部成员字段需要单独设值。
     */
    COMPLEX

}
