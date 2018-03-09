<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <TITLE>编辑客户</TITLE>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
    <LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css rel=stylesheet>
    <META content="MSHTML 6.00.2900.3492" name=GENERATOR>

    <script type="text/javascript">
        function loadDict(type_code, tagId, oldVal) {
            //发起请求，获取字典数据 按类型查询字典数据
            var url = "${pageContext.request.contextPath }/baseDict_findByType";
            $.post(url, {"dict_type_code": type_code}, function (result) {

                //result -- list<BaseDict>  -- json
                $(result).each(function (i, n) { //i : 遍历的下标，  n : 遍历出来的对象   字典对象

                    $(tagId).append("<option value='" + n.dict_id + "'>" + n.dict_item_name + "</option>")
                });

                //选中该选中的option  在指定的id标签身上找option标签， 按照value值来找，如果找到了就修改这个option标签的属性，修改selected属性，值为selected
                $(tagId).find("option[value='" + oldVal + "']").attr("selected", "selected");

            }, "json");
        }

        $(function () {
            //alert("执行了入口函数")
            loadDict("001", "#cust_industry", "${editCustomer.cust_industry.dict_id}"); //001  -- 客户行业
            loadDict("002", "#cust_source", "${editCustomer.cust_source.dict_id}"); //002  -- 客户来源
            loadDict("006", "#cust_level", "${editCustomer.cust_level.dict_id}");//006  -- 客户级别
        })

    </script>
</HEAD>
<BODY>
<FORM id=form1 name=form1 action="${pageContext.request.contextPath }customer_update"
      method=post>
    <input type="hidden" name="cust_id" value="${editCustomer.cust_id}">
    <input type="hidden" name="cust_user_id.user_id" value="${editCustomer.cust_user_id.user_id}">
    <input type="hidden" name="cust_create_id.user_id" value="${editCustomer.cust_create_id.user_id}">
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg" border=0></TD>
            <TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg" height=20></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_022.jpg">
                <IMG src="${pageContext.request.contextPath }/images/new_022.jpg" border=0>
            </TD>
            <TD vAlign=top width="100%" bgColor=#ffffff>
                <TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
                    <TR>
                        <TD class=manageHead>当前位置：客户管理 &gt; 编辑客户</TD>
                    </TR>
                    <TR>
                        <TD height=2></TD>
                    </TR>
                </TABLE>
                <TABLE cellSpacing=0 cellPadding=5 border=0>
                    <TR>
                        <td>客户名称：</td>
                        <td>
                            <INPUT class=textbox id=sChannel6 style="WIDTH: 180px" maxLength=50 name="cust_name"
                                   value="${editCustomer.cust_name}">
                        </td>
                        <td>所属行业 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel2 style="WIDTH: 180px" maxLength=50 name="cust_industry.dict_id"
                                   value="${editCustomer.cust_industry.dict_item_name}">
                        </td>
                    </TR>
                    <TR>
                        <td>信息来源 ：</td>
                        <td>
                            <select name="cust_source.dict_id" class=textbox id=sChannel1 style="WIDTH: 180px">
                                <option value="non">---请选择---</option>
                                <option value="6" ${editCustomer.cust_source=="6"?"selected":""}>电话营销</option>
                                <option value="7" ${editCustomer.cust_source=="7"?"selected":""}>网络营销</option>
                            </select>
                        </td>
                        <td>客户级别：</td>
                        <td>
                            <select name="cust_level.dict_id" class=textbox id=sChannel3 style="WIDTH: 180px">
                                <option value="non">---请选择---</option>
                                <option value="22" ${editCustomer.cust_level=="22"?"selected":""}>普通客户</option>
                                <option value="23" ${editCustomer.cust_level=="23"?"selected":""}>VIP客户</option>
                            </select>
                        </td>
                    </TR>
                    <TR>
                        <td>联系地址 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel4 style="WIDTH: 180px" maxLength=50 name="cust_address"
                                   value="${editCustomer.cust_address}">
                        </td>
                        <td>联系电话 ：</td>
                        <td>
                            <INPUT class=textbox id=sChannel5 style="WIDTH: 180px" maxLength=50 name="cust_phone"
                                   value="${editCustomer.cust_phone}">
                        </td>
                    </TR>
                    <tr>
                        <td rowspan=2>
                            <INPUT class=button id=sButton2 type=submit value=" 保存 ">
                        </td>
                    </tr>
                </TABLE>
            </TD>
            <TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
                <IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0>
            </TD>
        </TR>
        </TBODY>
    </TABLE>
    <TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
        <TBODY>
        <TR>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg" border=0></TD>
            <TD align="center" width="100%" background="${pageContext.request.contextPath }/images/new_025.jpg"
                height=15></TD>
            <TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg" border=0></TD>
        </TR>
        </TBODY>
    </TABLE>
</FORM>
</BODY>
</HTML>
