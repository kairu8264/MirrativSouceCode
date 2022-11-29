package com.google.android.exoplayer2.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class SlidingPercentile {
    private static final int MAX_RECYCLED_SAMPLES = 5;
    private static final int SORT_ORDER_BY_INDEX = 1;
    private static final int SORT_ORDER_BY_VALUE = 0;
    private static final int SORT_ORDER_NONE = -1;
    private final int maxWeight;
    private int nextSampleIndex;
    private int recycledSampleCount;
    private int totalWeight;
    private static final Comparator<Sample> INDEX_COMPARATOR = c.f27052w;
    private static final Comparator<Sample> VALUE_COMPARATOR = d.f27053w;
    private final Sample[] recycledSamples = new Sample[5];
    private final ArrayList<Sample> samples = new ArrayList<>();
    private int currentSortOrder = -1;

    /* loaded from: classes3.dex */
    public static class Sample {
        public int index;
        public float value;
        public int weight;

        private Sample() {
        }
    }

    public SlidingPercentile(int i10) {
        this.maxWeight = i10;
    }

    private void ensureSortedByIndex() {
        if (this.currentSortOrder != 1) {
            Collections.sort(this.samples, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
    }

    private void ensureSortedByValue() {
        if (this.currentSortOrder != 0) {
            Collections.sort(this.samples, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Sample sample, Sample sample2) {
        return sample.index - sample2.index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$1(Sample sample, Sample sample2) {
        return Float.compare(sample.value, sample2.value);
    }

    public void addSample(int i10, float f10) {
        Sample sample;
        ensureSortedByIndex();
        int i11 = this.recycledSampleCount;
        if (i11 > 0) {
            Sample[] sampleArr = this.recycledSamples;
            int i12 = i11 - 1;
            this.recycledSampleCount = i12;
            sample = sampleArr[i12];
        } else {
            sample = new Sample();
        }
        int i13 = this.nextSampleIndex;
        this.nextSampleIndex = i13 + 1;
        sample.index = i13;
        sample.weight = i10;
        sample.value = f10;
        this.samples.add(sample);
        this.totalWeight += i10;
        while (true) {
            int i14 = this.totalWeight;
            int i15 = this.maxWeight;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            Sample sample2 = this.samples.get(0);
            int i17 = sample2.weight;
            if (i17 <= i16) {
                this.totalWeight -= i17;
                this.samples.remove(0);
                int i18 = this.recycledSampleCount;
                if (i18 < 5) {
                    Sample[] sampleArr2 = this.recycledSamples;
                    this.recycledSampleCount = i18 + 1;
                    sampleArr2[i18] = sample2;
                }
            } else {
                sample2.weight = i17 - i16;
                this.totalWeight -= i16;
            }
        }
    }

    public float getPercentile(float f10) {
        ArrayList<Sample> arrayList;
        ensureSortedByValue();
        float f11 = f10 * this.totalWeight;
        int i10 = 0;
        for (int i11 = 0; i11 < this.samples.size(); i11++) {
            Sample sample = this.samples.get(i11);
            i10 += sample.weight;
            if (i10 >= f11) {
                return sample.value;
            }
        }
        if (this.samples.isEmpty()) {
            return Float.NaN;
        }
        return this.samples.get(arrayList.size() - 1).value;
    }

    public void reset() {
        this.samples.clear();
        this.currentSortOrder = -1;
        this.nextSampleIndex = 0;
        this.totalWeight = 0;
    }
}
