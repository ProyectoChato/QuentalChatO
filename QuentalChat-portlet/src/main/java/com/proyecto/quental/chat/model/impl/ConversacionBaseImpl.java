package com.proyecto.quental.chat.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.proyecto.quental.chat.model.Conversacion;
import com.proyecto.quental.chat.service.ConversacionLocalServiceUtil;

/**
 * The extended model base implementation for the Conversacion service. Represents a row in the &quot;Conversacion&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ConversacionImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ConversacionImpl
 * @see com.proyecto.quental.chat.model.Conversacion
 * @generated
 */
public abstract class ConversacionBaseImpl extends ConversacionModelImpl
    implements Conversacion {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a conversacion model instance should use the {@link Conversacion} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            ConversacionLocalServiceUtil.addConversacion(this);
        } else {
            ConversacionLocalServiceUtil.updateConversacion(this);
        }
    }
}
