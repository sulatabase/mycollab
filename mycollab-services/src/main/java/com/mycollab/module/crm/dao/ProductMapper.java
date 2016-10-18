/**
 * This file is part of mycollab-services.
 *
 * mycollab-services is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-services is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-services.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.mycollab.module.crm.dao;

import com.mycollab.db.persistence.ICrudGenericDAO;
import com.mycollab.module.crm.domain.Product;
import com.mycollab.module.crm.domain.ProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings({ "ucd", "rawtypes" })
public interface ProductMapper extends ICrudGenericDAO {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    long countByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int deleteByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int insert(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int insertSelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    List<Product> selectByExample(ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    Product selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    int updateByPrimaryKey(Product record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    Integer insertAndReturnKey(Product value);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    void removeKeysWithSession(List primaryKeys);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_crm_product
     *
     * @mbg.generated Tue Oct 18 22:31:55 ICT 2016
     */
    void massUpdateWithSession(@Param("record") Product record, @Param("primaryKeys") List primaryKeys);
}