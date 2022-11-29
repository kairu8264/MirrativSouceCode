package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import vk.d;

/* loaded from: classes.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: w  reason: collision with root package name */
    public final List<d<?>> f27944w;

    public DependencyCycleException(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f27944w = list;
    }
}
