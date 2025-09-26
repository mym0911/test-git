/**
 * Copyright (c) 2018-2099, Chill Zhuang 庄骞 (bladejava@qq.com).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springblade.modules.ainotice.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import org.springblade.core.mp.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serial;

/**
 * 会话表实体类
 *
 * @author Blade
 * @since 2025-09-07
 */
@Data
@TableName("chat_ai_conversation")
@EqualsAndHashCode(callSuper = true)
@Schema(description = "会话表")
public class ChatAiConversation extends BaseEntity {

    @Serial
	private static final long serialVersionUID = 1L;

    /**
     * 标题
     */
  @Schema(description = "标题")
  private String title;


}
