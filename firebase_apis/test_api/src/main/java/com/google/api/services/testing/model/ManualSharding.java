/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * Modify at your own risk.
 */

package com.google.api.services.testing.model;

/**
 * Shards test cases into the specified groups of packages, classes, and/or methods.
 *
 * With manual sharding enabled, specifying test targets via environment_variables or in
 * InstrumentationTest is invalid.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManualSharding extends com.google.api.client.json.GenericJson {

  /**
   * Required. Group of packages, classes, and/or test methods to be run for each shard. When any
   * physical devices are selected,  the number of test_targets_for_shard must be >= 1 and <= 50.
   * When no physical devices are selected, the number must be >= 1 and <= 250.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestTargetsForShard> testTargetsForShard;

  /**
   * Required. Group of packages, classes, and/or test methods to be run for each shard. When any
   * physical devices are selected,  the number of test_targets_for_shard must be >= 1 and <= 50.
   * When no physical devices are selected, the number must be >= 1 and <= 250.
   * @return value or {@code null} for none
   */
  public java.util.List<TestTargetsForShard> getTestTargetsForShard() {
    return testTargetsForShard;
  }

  /**
   * Required. Group of packages, classes, and/or test methods to be run for each shard. When any
   * physical devices are selected,  the number of test_targets_for_shard must be >= 1 and <= 50.
   * When no physical devices are selected, the number must be >= 1 and <= 250.
   * @param testTargetsForShard testTargetsForShard or {@code null} for none
   */
  public ManualSharding setTestTargetsForShard(java.util.List<TestTargetsForShard> testTargetsForShard) {
    this.testTargetsForShard = testTargetsForShard;
    return this;
  }

  @Override
  public ManualSharding set(String fieldName, Object value) {
    return (ManualSharding) super.set(fieldName, value);
  }

  @Override
  public ManualSharding clone() {
    return (ManualSharding) super.clone();
  }

}
