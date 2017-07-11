/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.config.vault.client;

import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;

/**
 * Converter for {@link io.vertx.config.vault.client.TokenRequest}.
 *
 * NOTE: This class has been automatically generated from the {@link io.vertx.config.vault.client.TokenRequest} original class using Vert.x codegen.
 */
public class TokenRequestConverter {

  public static void fromJson(JsonObject json, TokenRequest obj) {
    if (json.getValue("displayName") instanceof String) {
      obj.setDisplayName((String)json.getValue("displayName"));
    }
    if (json.getValue("id") instanceof String) {
      obj.setId((String)json.getValue("id"));
    }
    if (json.getValue("meta") instanceof JsonObject) {
      java.util.Map<String, java.lang.String> map = new java.util.LinkedHashMap<>();
      json.getJsonObject("meta").forEach(entry -> {
        if (entry.getValue() instanceof String)
          map.put(entry.getKey(), (String)entry.getValue());
      });
      obj.setMeta(map);
    }
    if (json.getValue("noDefaultPolicy") instanceof Boolean) {
      obj.setNoDefaultPolicy((Boolean)json.getValue("noDefaultPolicy"));
    }
    if (json.getValue("noParent") instanceof Boolean) {
      obj.setNoParent((Boolean)json.getValue("noParent"));
    }
    if (json.getValue("numUses") instanceof Number) {
      obj.setNumUses(((Number)json.getValue("numUses")).longValue());
    }
    if (json.getValue("policies") instanceof JsonArray) {
      java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<>();
      json.getJsonArray("policies").forEach( item -> {
        if (item instanceof String)
          list.add((String)item);
      });
      obj.setPolicies(list);
    }
    if (json.getValue("role") instanceof String) {
      obj.setRole((String)json.getValue("role"));
    }
    if (json.getValue("ttl") instanceof String) {
      obj.setTTL((String)json.getValue("ttl"));
    }
  }

  public static void toJson(TokenRequest obj, JsonObject json) {
    if (obj.getDisplayName() != null) {
      json.put("displayName", obj.getDisplayName());
    }
    if (obj.getId() != null) {
      json.put("id", obj.getId());
    }
    if (obj.getMeta() != null) {
      JsonObject map = new JsonObject();
      obj.getMeta().forEach((key,value) -> map.put(key, value));
      json.put("meta", map);
    }
    json.put("noDefaultPolicy", obj.isNoDefaultPolicy());
    json.put("noParent", obj.isNoParent());
    json.put("numUses", obj.getNumUses());
    if (obj.getPolicies() != null) {
      JsonArray array = new JsonArray();
      obj.getPolicies().forEach(item -> array.add(item));
      json.put("policies", array);
    }
    if (obj.getRole() != null) {
      json.put("role", obj.getRole());
    }
    if (obj.getTtl() != null) {
      json.put("ttl", obj.getTtl());
    }
  }
}