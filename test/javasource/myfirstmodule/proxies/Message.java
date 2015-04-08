// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixIdentifier;
import com.mendix.systemwideinterfaces.core.IMendixObject;

/**
 * 
 */
public class Message
{
	private final IMendixObject messageMendixObject;

	private final IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final String entityName = "MyFirstModule.Message";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		MessageText("MessageText"),
		IsDisplayed("IsDisplayed");

		private String metaName;

		MemberNames(String s)
		{
			metaName = s;
		}

		@Override
		public String toString()
		{
			return metaName;
		}
	}

	public Message(IContext context)
	{
		this(context, Core.instantiate(context, "MyFirstModule.Message"));
	}

	protected Message(IContext context, IMendixObject messageMendixObject)
	{
		if (messageMendixObject == null)
			throw new IllegalArgumentException("The given object cannot be null.");
		if (!Core.isSubClassOf("MyFirstModule.Message", messageMendixObject.getType()))
			throw new IllegalArgumentException("The given object is not a MyFirstModule.Message");

		this.messageMendixObject = messageMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'new Message(Context)' instead. Note that the constructor will not insert the new object in the database.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Message create(IContext context) throws CoreException
	{
		IMendixObject mendixObject = Core.create(context, "MyFirstModule.Message");
		return new myfirstmodule.proxies.Message(context, mendixObject);
	}

	/**
	 * @deprecated Use 'Message.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Message initialize(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		return myfirstmodule.proxies.Message.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.getSudoContext() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Message initialize(IContext context, IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Message(context, mendixObject);
	}

	public static myfirstmodule.proxies.Message load(IContext context, IMendixIdentifier mendixIdentifier) throws CoreException
	{
		IMendixObject mendixObject = Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Message.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Message> load(IContext context, String xpathConstraint) throws CoreException
	{
		java.util.List<myfirstmodule.proxies.Message> result = new java.util.ArrayList<myfirstmodule.proxies.Message>();
		for (IMendixObject obj : Core.retrieveXPathQuery(context, "//MyFirstModule.Message" + xpathConstraint))
			result.add(myfirstmodule.proxies.Message.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(IContext context) throws CoreException
	{
		Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(IContext context)
	{
		Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of MessageText
	 */
	public final String getMessageText()
	{
		return getMessageText(getContext());
	}

	/**
	 * @param context
	 * @return value of MessageText
	 */
	public final String getMessageText(IContext context)
	{
		return (String) getMendixObject().getValue(context, MemberNames.MessageText.toString());
	}

	/**
	 * Set value of MessageText
	 * @param messagetext
	 */
	public final void setMessageText(String messagetext)
	{
		setMessageText(getContext(), messagetext);
	}

	/**
	 * Set value of MessageText
	 * @param context
	 * @param messagetext
	 */
	public final void setMessageText(IContext context, String messagetext)
	{
		getMendixObject().setValue(context, MemberNames.MessageText.toString(), messagetext);
	}

	/**
	 * @return value of IsDisplayed
	 */
	public final Boolean getIsDisplayed()
	{
		return getIsDisplayed(getContext());
	}

	/**
	 * @param context
	 * @return value of IsDisplayed
	 */
	public final Boolean getIsDisplayed(IContext context)
	{
		return (Boolean) getMendixObject().getValue(context, MemberNames.IsDisplayed.toString());
	}

	/**
	 * Set value of IsDisplayed
	 * @param isdisplayed
	 */
	public final void setIsDisplayed(Boolean isdisplayed)
	{
		setIsDisplayed(getContext(), isdisplayed);
	}

	/**
	 * Set value of IsDisplayed
	 * @param context
	 * @param isdisplayed
	 */
	public final void setIsDisplayed(IContext context, Boolean isdisplayed)
	{
		getMendixObject().setValue(context, MemberNames.IsDisplayed.toString(), isdisplayed);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final IMendixObject getMendixObject()
	{
		return messageMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Message that = (myfirstmodule.proxies.Message) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static String getType()
	{
		return "MyFirstModule.Message";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}