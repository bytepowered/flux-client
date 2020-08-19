package net.bytepowered.flux.core;


import java.lang.reflect.Type;

/**
 * FxParameter 解析器
 *
 * @author 陈哈哈 (yongjia.chen@hotmail.com)
 */
public interface ParameterResolver {

    /**
     * 解析参数，返回参数字段。如果不解析，返回Null
     *
     * @param parameter   参数对象
     * @param genericType 参数的泛型类型
     * @return ArgumentMetadata，或者为Null
     */
    ArgumentMetadata resolve(java.lang.reflect.Parameter parameter, Type genericType);
}
