/*
 * Copyright (C), 2015-2021, zhaojn
 * FileName: ResponseEntityVo
 * Author:   zhaojn
 * Date:     2021/4/9 22:43
 * Description: 响应体
 * History:
 * 作者姓名          修改时间          版本号          描述
 * zhaojn           2021/4/9 22:43   1.0.0           初版
 */

package com.zhaojn.license.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 响应体<br>
 *
 * @author zhaojn
 * @create 2021/4/9
 * @since 1.0.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseEntityVo {
  public static final String STATUS_SUCCESS = "success";

  public static final String STATUS_ERROR = "error";

  @JsonProperty("status")
  private String status;

  @JsonProperty("error_messages")
  private List<ErrorMessage> errorMessages;

  @JsonProperty("result")
  private Object result;

  public static Builder builder() {
    return new Builder(new ResponseEntityVo());
  }

  public static class Builder {
    private ResponseEntityVo entityVo;

    public Builder(ResponseEntityVo entityVo) {
      this.entityVo = entityVo;
    }

    public Builder errorMessages(List<ErrorMessage> errorMessages) {
      entityVo.setErrorMessages(errorMessages);
      return this;
    }

    public Builder result(Object result) {
      entityVo.setResult(result);
      return this;
    }

    public ResponseEntityVo build() {
      if (!CollectionUtils.isEmpty(this.entityVo.getErrorMessages())) {
        this.entityVo.setStatus(STATUS_ERROR);
      } else {
        this.entityVo.setStatus(STATUS_SUCCESS);
      }
      return this.entityVo;
    }
  }
}
