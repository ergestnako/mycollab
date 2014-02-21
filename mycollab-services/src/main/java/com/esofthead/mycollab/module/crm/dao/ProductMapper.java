package com.esofthead.mycollab.module.crm.dao;

import com.esofthead.mycollab.core.persistence.ICrudGenericDAO;
import com.esofthead.mycollab.module.crm.domain.Product;
import com.esofthead.mycollab.module.crm.domain.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProductMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    Integer insertAndReturnKey(Product value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbggenerated Sun Feb 09 16:13:44 ICT 2014
     */
    void massUpdateWithSession(@Param("record") Product record, @Param("primaryKeys") List primaryKeys);
}