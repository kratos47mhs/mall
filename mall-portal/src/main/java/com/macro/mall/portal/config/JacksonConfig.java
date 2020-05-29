package com.macro.mall.portal.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;


/**
 * Jackson configuration class
 * json does not return null fields
 * Created by macro on 2018/8/2.
 */
@Configuration
public class JacksonConfig {
    @Bean
    @Primary
    @ConditionalOnMissingBean(ObjectMapper.class)
    public ObjectMapper jacksonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false).build();

        // Through this method to set the mapper object, all serialized objects will be serialized according to the rules
        // Include.Include.ALWAYS Default
        // Include.NON_DEFAULT property is not serialized by default
        // If the Include.NON_EMPTY attribute is empty ("") or NULL, it is not serialized, and the returned json does not have this field. This will save more data for mobile
        // Include.NON_NULL attribute is NULL not serialized, that is, null fields do not participate in serialization
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);

        // The field is reserved and the null value is converted to""
//        objectMapper.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>()
//        {
//            @Override
//            public void serialize(Object o, JsonGenerator jsonGenerator,
//                                  SerializerProvider serializerProvider)
//                    throws IOException, JsonProcessingException
//            {
//                jsonGenerator.writeString("");
//            }
//        });
        return objectMapper;
    }
}
