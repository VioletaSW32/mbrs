package enumerations;

namespace Model
{
	public enum ${class.name} 
	{
	<#list properties as property>
		<#if property == properties?last>
		${property}
		<#else>
		${property},
		</#if>
	</#list>
	}
}