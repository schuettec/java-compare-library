package com.remondis.jacoli;

import java.util.function.Function;

public interface OngoingCompareBuilder<T, V> {

  public <V1> RightCompareBuilder<T, V1> andComparing(Function<T, V1> leftHandSideValueExtractor);

  // public <V1, C extends Collection<V1>> RightCompareCollectionBuilder<T, V1> andComparingCollection(
  // Function<T, C> leftHandSideValueExtractor);

  public Comparison<T> build();

}
