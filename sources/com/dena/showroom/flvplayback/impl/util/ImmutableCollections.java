package com.dena.showroom.flvplayback.impl.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class ImmutableCollections {
    @SafeVarargs
    public static <E> List<E> seq(E... eArr) {
        return Collections.unmodifiableList(Arrays.asList(eArr));
    }

    @SafeVarargs
    public static <E> Set<E> set(E... eArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(eArr)));
    }
}
