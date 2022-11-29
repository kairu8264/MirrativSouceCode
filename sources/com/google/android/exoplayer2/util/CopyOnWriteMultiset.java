package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class CopyOnWriteMultiset<E> implements Iterable<E> {
    private final Object lock = new Object();
    private final Map<E, Integer> elementCounts = new HashMap();
    private Set<E> elementSet = Collections.emptySet();
    private List<E> elements = Collections.emptyList();

    public void add(E e10) {
        synchronized (this.lock) {
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.add(e10);
            this.elements = Collections.unmodifiableList(arrayList);
            Integer num = this.elementCounts.get(e10);
            if (num == null) {
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.add(e10);
                this.elementSet = Collections.unmodifiableSet(hashSet);
            }
            this.elementCounts.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
        }
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.lock) {
            set = this.elementSet;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.lock) {
            it = this.elements.iterator();
        }
        return it;
    }

    public void remove(E e10) {
        synchronized (this.lock) {
            Integer num = this.elementCounts.get(e10);
            if (num == null) {
                return;
            }
            ArrayList arrayList = new ArrayList(this.elements);
            arrayList.remove(e10);
            this.elements = Collections.unmodifiableList(arrayList);
            if (num.intValue() == 1) {
                this.elementCounts.remove(e10);
                HashSet hashSet = new HashSet(this.elementSet);
                hashSet.remove(e10);
                this.elementSet = Collections.unmodifiableSet(hashSet);
            } else {
                this.elementCounts.put(e10, Integer.valueOf(num.intValue() - 1));
            }
        }
    }
}
