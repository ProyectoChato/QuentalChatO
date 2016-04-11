package com.proyecto.quental.chat.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import com.proyecto.quental.chat.service.AsignacionLocalServiceUtil;
import com.proyecto.quental.chat.service.AsignacionServiceUtil;
import com.proyecto.quental.chat.service.ClpSerializer;
import com.proyecto.quental.chat.service.ConversacionLocalServiceUtil;
import com.proyecto.quental.chat.service.ConversacionServiceUtil;
import com.proyecto.quental.chat.service.MensajeLocalServiceUtil;
import com.proyecto.quental.chat.service.MensajeServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AsignacionLocalServiceUtil.clearService();

            AsignacionServiceUtil.clearService();
            ConversacionLocalServiceUtil.clearService();

            ConversacionServiceUtil.clearService();
            MensajeLocalServiceUtil.clearService();

            MensajeServiceUtil.clearService();
        }
    }
}
