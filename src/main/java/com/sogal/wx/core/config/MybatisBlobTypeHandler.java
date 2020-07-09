package com.sogal.wx.core.config;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;

import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.sql.*;

@MappedJdbcTypes(JdbcType.BLOB)
public class MybatisBlobTypeHandler extends BaseTypeHandler<String> {

    // 指定字符集
    private static final String DEFAULT_CHARSET = "utf-8";


    @Override
    public void setNonNullParameter(PreparedStatement ps, int i,
                                    String parameter, JdbcType jdbcType) throws SQLException
    {
        ByteArrayInputStream bis;
        try
        {
            // 把String转化成byte流
            bis = new ByteArrayInputStream(parameter.getBytes(DEFAULT_CHARSET));
        } catch (UnsupportedEncodingException e)
        {
            throw new RuntimeException("Blob Encoding Error!");
        }
        ps.setBinaryStream(i, bis, parameter.length());
    }



    @Override
    public String getNullableResult(ResultSet rs, String columnName)
            throws SQLException
    {
        Blob blob = rs.getBlob(columnName);
        return blobConvertToString(blob);
    }

    @Override
    public String getNullableResult(CallableStatement callableStatement, int columnIndex)
            throws SQLException
    {
        Blob blob = callableStatement.getBlob(columnIndex);
        return  blobConvertToString(blob);
    }


    @Override
    public String getNullableResult(ResultSet resultSet, int columnIndex)
            throws SQLException
    {
        Blob blob = resultSet.getBlob(columnIndex);
        return blobConvertToString(blob);

    }

    private String blobConvertToString(Blob blob) throws SQLException {
        byte[] returnValue = null;
        String result = null;
        if (null != blob)
        {
            returnValue = blob.getBytes(1, (int) blob.length());
        }
        try
        {
            if (null != returnValue)
            {
                // 把byte转化成string
                result = new String(returnValue, DEFAULT_CHARSET);
            }
        } catch (UnsupportedEncodingException e)
        {
            throw new RuntimeException("Blob Encoding Error!");
        }
        return result;
    }

}
