package com.proyecto.quental.chat.service.base;

import com.proyecto.quental.chat.service.ConversacionServiceUtil;

import java.util.Arrays;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ConversacionServiceClpInvoker {
    private String _methodName30;
    private String[] _methodParameterTypes30;
    private String _methodName31;
    private String[] _methodParameterTypes31;

    public ConversacionServiceClpInvoker() {
        _methodName30 = "getBeanIdentifier";

        _methodParameterTypes30 = new String[] {  };

        _methodName31 = "setBeanIdentifier";

        _methodParameterTypes31 = new String[] { "java.lang.String" };
    }

    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        if (_methodName30.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
            return ConversacionServiceUtil.getBeanIdentifier();
        }

        if (_methodName31.equals(name) &&
                Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
            ConversacionServiceUtil.setBeanIdentifier((java.lang.String) arguments[0]);

            return null;
        }

        throw new UnsupportedOperationException();
    }
}
