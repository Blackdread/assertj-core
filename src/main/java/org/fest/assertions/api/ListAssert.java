/*
 * Created on Oct 26, 2010
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright @2010 the original author or authors.
 */
package org.fest.assertions.api;

import java.util.List;

import org.fest.assertions.core.*;
import org.fest.assertions.data.Index;
import org.fest.assertions.description.Description;
import org.fest.assertions.internal.*;
import org.fest.util.VisibleForTesting;

/**
 * Assertion methods for <code>{@link List}</code>s. To create an instance of this class, use the factory method
 * <code>{@link Assertions#assertThat(List)}</code>.
 *
 * @author Yvonne Wang
 * @author Alex Ruiz
 */
public class ListAssert implements ObjectGroupAssert, Assert<List<?>> {

  @VisibleForTesting Objects objects = Objects.instance();
  @VisibleForTesting Collections collections = Collections.instance();
  @VisibleForTesting Conditions conditions = Conditions.instance();

  @VisibleForTesting final List<?> actual;
  @VisibleForTesting final WritableAssertionInfo info;

  protected ListAssert(List<?> actual) {
    this.actual = actual;
    info = new WritableAssertionInfo();
  }

  /** {@inheritDoc} */
  public ListAssert as(String description) {
    return describedAs(description);
  }

  /** {@inheritDoc} */
  public ListAssert as(Description description) {
    return describedAs(description);
  }

  /** {@inheritDoc} */
  public ListAssert describedAs(String description) {
    info.description(description);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert describedAs(Description description) {
    info.description(description);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert isEqualTo(List<?> expected) {
    objects.assertEqual(info, actual, expected);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert isNotEqualTo(List<?> other) {
    objects.assertNotEqual(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public void isNull() {
    objects.assertNull(info, actual);
  }

  /** {@inheritDoc} */
  public ListAssert isNotNull() {
    objects.assertNotNull(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert isSameAs(List<?> expected) {
    objects.assertSame(info, actual, expected);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert isNotSameAs(List<?> other) {
    objects.assertNotSame(info, actual, other);
    return this;
  }

  /** {@inheritDoc} */
  public void isNullOrEmpty() {
    collections.assertNullOrEmpty(info, actual);
  }

  /** {@inheritDoc} */
  public void isEmpty() {
    collections.assertEmpty(info, actual);
  }

  /** {@inheritDoc} */
  public ListAssert isNotEmpty() {
    collections.assertNotEmpty(info, actual);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert hasSize(int expected) {
    collections.assertHasSize(info, actual, expected);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert contains(Object... values) {
    collections.assertContains(info, actual, values);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert containsExclusively(Object... values) {
    collections.assertContainsExclusively(info, actual, values);
    return this;
  }

  /**
   * Verifies that the list value contains the given object at the given index.
   * @param o the object to look for.
   * @param index the index where the object should be stored in the actual {@code List}.
   * @return this assertion object.
   * @throws NullPointerException if the given {@code Index} is {@code null}.
   * @throws IndexOutOfBoundsException if the value of the given {@code Index} is equal to or greater than the size of
   * the actual {@code List}.
   * @throws AssertionError if the actual list is {@code null}.
   * @throws AssertionError if the actual list does not contain the given object at the given index.
   */
  public ListAssert contains(Object o, Index index) {
    // TODO implement
    return null;
  }

  /**
   * Verifies that the actual list contains the given sequence of objects, without any other objects between them.
   * @param sequence the sequence of objects to look for.
   * @return this assertion object.
   * @throws NullPointerException if the given array is {@code null}.
   * @throws IllegalArgumentException if the given array is empty.
   * @throws AssertionError if the actual list is {@code null}.
   * @throws AssertionError if the actual list does not contain the given sequence of objects.
   */
  public ListAssert containsSequence(Object... sequence) {
    // TODO implement
    return null;
  }

  /** {@inheritDoc} */
  public ListAssert doesNotContain(Object... values) {
    collections.assertDoesNotContain(info, actual, values);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert doesNotHaveDuplicates() {
    collections.assertDoesHaveDuplicates(info, actual);
    return this;
  }

  /**
   * Verifies that the actual list starts with the given sequence of objects, without any other objects between them.
   * Similar to <code>{@link #containsSequence}</code>, but verifies also that the first given object is also the first
   * element of the actual list.
   * @param sequence the sequence of objects to look for.
   * @return this assertion object.
   * @throws NullPointerException if the given array is {@code null}.
   * @throws IllegalArgumentException if the given array is empty.
   * @throws AssertionError if the actual list is {@code null}.
   * @throws AssertionError if the actual list does not start with the given sequence of objects.
   */
  public ListAssert startsWith(Object... sequence) {
    // TODO implement
    return null;
  }

  /**
   * Verifies that the actual list ends with the given sequence of objects, without any other objects between them.
   * Similar to <code>{@link #containsSequence}</code>, but verifies also that the last given object is also the last
   * element of actual list.
   * @param sequence the sequence of objects to look for.
   * @return this assertion object.
   * @throws NullPointerException if the given array is {@code null}.
   * @throws IllegalArgumentException if the given array is empty.
   * @throws AssertionError if the actual list is {@code null}.
   * @throws AssertionError if the actual list does not end with the given sequence of objects.
   */
  public ListAssert endsWith(Object... sequence) {
    // TODO implement
    return null;
  }

  /** {@inheritDoc} */
  public ListAssert satisfies(Condition<List<?>> condition) {
    conditions.assertSatisfies(info, actual, condition);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert doesNotSatisfy(Condition<List<?>> condition) {
    conditions.assertDoesNotSatisfy(info, actual, condition);
    return this;
  }

  /** {@inheritDoc} */
  public ListAssert is(Condition<List<?>> condition) {
    return satisfies(condition);
  }

  /** {@inheritDoc} */
  public ListAssert isNot(Condition<List<?>> condition) {
    return doesNotSatisfy(condition);
  }

  @VisibleForTesting final String descriptionText() {
    return info.descriptionText();
  }
}
