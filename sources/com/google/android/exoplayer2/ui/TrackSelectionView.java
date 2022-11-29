package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.MappingTrackSelector;
import com.google.android.exoplayer2.ui.TrackSelectionView;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes3.dex */
public class TrackSelectionView extends LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final ComponentListener componentListener;
    private final CheckedTextView defaultView;
    private final CheckedTextView disableView;
    private final LayoutInflater inflater;
    private boolean isDisabled;
    private TrackSelectionListener listener;
    private MappingTrackSelector.MappedTrackInfo mappedTrackInfo;
    private final SparseArray<DefaultTrackSelector.SelectionOverride> overrides;
    private int rendererIndex;
    private final int selectableItemBackgroundResourceId;
    private TrackGroupArray trackGroups;
    private Comparator<TrackInfo> trackInfoComparator;
    private TrackNameProvider trackNameProvider;
    private CheckedTextView[][] trackViews;

    /* loaded from: classes3.dex */
    public class ComponentListener implements View.OnClickListener {
        private ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.onClick(view);
        }
    }

    /* loaded from: classes3.dex */
    public static final class TrackInfo {
        public final Format format;
        public final int groupIndex;
        public final int trackIndex;

        public TrackInfo(int i10, int i11, Format format) {
            this.groupIndex = i10;
            this.trackIndex = i11;
            this.format = format;
        }
    }

    /* loaded from: classes3.dex */
    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean z10, List<DefaultTrackSelector.SelectionOverride> list);
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    private static int[] getTracksAdding(int[] iArr, int i10) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i10;
        return copyOf;
    }

    private static int[] getTracksRemoving(int[] iArr, int i10) {
        int[] iArr2 = new int[iArr.length - 1];
        int i11 = 0;
        for (int i12 : iArr) {
            if (i12 != i10) {
                iArr2[i11] = i12;
                i11++;
            }
        }
        return iArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$init$0(Comparator comparator, TrackInfo trackInfo, TrackInfo trackInfo2) {
        return comparator.compare(trackInfo.format, trackInfo2.format);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onClick(View view) {
        if (view == this.disableView) {
            onDisableViewClicked();
        } else if (view == this.defaultView) {
            onDefaultViewClicked();
        } else {
            onTrackViewClicked(view);
        }
        updateViewStates();
        TrackSelectionListener trackSelectionListener = this.listener;
        if (trackSelectionListener != null) {
            trackSelectionListener.onTrackSelectionChanged(getIsDisabled(), getOverrides());
        }
    }

    private void onDefaultViewClicked() {
        this.isDisabled = false;
        this.overrides.clear();
    }

    private void onDisableViewClicked() {
        this.isDisabled = true;
        this.overrides.clear();
    }

    private void onTrackViewClicked(View view) {
        this.isDisabled = false;
        TrackInfo trackInfo = (TrackInfo) Assertions.checkNotNull(view.getTag());
        int i10 = trackInfo.groupIndex;
        int i11 = trackInfo.trackIndex;
        DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i10);
        Assertions.checkNotNull(this.mappedTrackInfo);
        if (selectionOverride == null) {
            if (!this.allowMultipleOverrides && this.overrides.size() > 0) {
                this.overrides.clear();
            }
            this.overrides.put(i10, new DefaultTrackSelector.SelectionOverride(i10, i11));
            return;
        }
        int i12 = selectionOverride.length;
        int[] iArr = selectionOverride.tracks;
        boolean isChecked = ((CheckedTextView) view).isChecked();
        boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i10);
        boolean z10 = shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection();
        if (isChecked && z10) {
            if (i12 == 1) {
                this.overrides.remove(i10);
            } else {
                this.overrides.put(i10, new DefaultTrackSelector.SelectionOverride(i10, getTracksRemoving(iArr, i11)));
            }
        } else if (isChecked) {
        } else {
            if (shouldEnableAdaptiveSelection) {
                this.overrides.put(i10, new DefaultTrackSelector.SelectionOverride(i10, getTracksAdding(iArr, i11)));
            } else {
                this.overrides.put(i10, new DefaultTrackSelector.SelectionOverride(i10, i11));
            }
        }
    }

    @RequiresNonNull({"mappedTrackInfo"})
    private boolean shouldEnableAdaptiveSelection(int i10) {
        return this.allowAdaptiveSelections && this.trackGroups.get(i10).length > 1 && this.mappedTrackInfo.getAdaptiveSupport(this.rendererIndex, i10, false) != 0;
    }

    private boolean shouldEnableMultiGroupSelection() {
        return this.allowMultipleOverrides && this.trackGroups.length > 1;
    }

    private void updateViewStates() {
        this.disableView.setChecked(this.isDisabled);
        this.defaultView.setChecked(!this.isDisabled && this.overrides.size() == 0);
        for (int i10 = 0; i10 < this.trackViews.length; i10++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = this.overrides.get(i10);
            int i11 = 0;
            while (true) {
                CheckedTextView[][] checkedTextViewArr = this.trackViews;
                if (i11 < checkedTextViewArr[i10].length) {
                    if (selectionOverride != null) {
                        this.trackViews[i10][i11].setChecked(selectionOverride.containsTrack(((TrackInfo) Assertions.checkNotNull(checkedTextViewArr[i10][i11].getTag())).trackIndex));
                    } else {
                        checkedTextViewArr[i10][i11].setChecked(false);
                    }
                    i11++;
                }
            }
        }
    }

    private void updateViews() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.mappedTrackInfo == null) {
            this.disableView.setEnabled(false);
            this.defaultView.setEnabled(false);
            return;
        }
        this.disableView.setEnabled(true);
        this.defaultView.setEnabled(true);
        TrackGroupArray trackGroups = this.mappedTrackInfo.getTrackGroups(this.rendererIndex);
        this.trackGroups = trackGroups;
        this.trackViews = new CheckedTextView[trackGroups.length];
        boolean shouldEnableMultiGroupSelection = shouldEnableMultiGroupSelection();
        int i10 = 0;
        while (true) {
            TrackGroupArray trackGroupArray = this.trackGroups;
            if (i10 < trackGroupArray.length) {
                TrackGroup trackGroup = trackGroupArray.get(i10);
                boolean shouldEnableAdaptiveSelection = shouldEnableAdaptiveSelection(i10);
                CheckedTextView[][] checkedTextViewArr = this.trackViews;
                int i11 = trackGroup.length;
                checkedTextViewArr[i10] = new CheckedTextView[i11];
                TrackInfo[] trackInfoArr = new TrackInfo[i11];
                for (int i12 = 0; i12 < trackGroup.length; i12++) {
                    trackInfoArr[i12] = new TrackInfo(i10, i12, trackGroup.getFormat(i12));
                }
                Comparator<TrackInfo> comparator = this.trackInfoComparator;
                if (comparator != null) {
                    Arrays.sort(trackInfoArr, comparator);
                }
                for (int i13 = 0; i13 < i11; i13++) {
                    if (i13 == 0) {
                        addView(this.inflater.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
                    }
                    CheckedTextView checkedTextView = (CheckedTextView) this.inflater.inflate((shouldEnableAdaptiveSelection || shouldEnableMultiGroupSelection) ? 17367056 : 17367055, (ViewGroup) this, false);
                    checkedTextView.setBackgroundResource(this.selectableItemBackgroundResourceId);
                    checkedTextView.setText(this.trackNameProvider.getTrackName(trackInfoArr[i13].format));
                    checkedTextView.setTag(trackInfoArr[i13]);
                    if (this.mappedTrackInfo.getTrackSupport(this.rendererIndex, i10, i13) == 4) {
                        checkedTextView.setFocusable(true);
                        checkedTextView.setOnClickListener(this.componentListener);
                    } else {
                        checkedTextView.setFocusable(false);
                        checkedTextView.setEnabled(false);
                    }
                    this.trackViews[i10][i13] = checkedTextView;
                    addView(checkedTextView);
                }
                i10++;
            } else {
                updateViewStates();
                return;
            }
        }
    }

    public boolean getIsDisabled() {
        return this.isDisabled;
    }

    public List<DefaultTrackSelector.SelectionOverride> getOverrides() {
        ArrayList arrayList = new ArrayList(this.overrides.size());
        for (int i10 = 0; i10 < this.overrides.size(); i10++) {
            arrayList.add(this.overrides.valueAt(i10));
        }
        return arrayList;
    }

    public void init(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int i10, boolean z10, List<DefaultTrackSelector.SelectionOverride> list, final Comparator<Format> comparator, TrackSelectionListener trackSelectionListener) {
        this.mappedTrackInfo = mappedTrackInfo;
        this.rendererIndex = i10;
        this.isDisabled = z10;
        this.trackInfoComparator = comparator == null ? null : new Comparator() { // from class: com.google.android.exoplayer2.ui.f0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int lambda$init$0;
                lambda$init$0 = TrackSelectionView.lambda$init$0(comparator, (TrackSelectionView.TrackInfo) obj, (TrackSelectionView.TrackInfo) obj2);
                return lambda$init$0;
            }
        };
        this.listener = trackSelectionListener;
        int size = this.allowMultipleOverrides ? list.size() : Math.min(list.size(), 1);
        for (int i11 = 0; i11 < size; i11++) {
            DefaultTrackSelector.SelectionOverride selectionOverride = list.get(i11);
            this.overrides.put(selectionOverride.groupIndex, selectionOverride);
        }
        updateViews();
    }

    public void setAllowAdaptiveSelections(boolean z10) {
        if (this.allowAdaptiveSelections != z10) {
            this.allowAdaptiveSelections = z10;
            updateViews();
        }
    }

    public void setAllowMultipleOverrides(boolean z10) {
        if (this.allowMultipleOverrides != z10) {
            this.allowMultipleOverrides = z10;
            if (!z10 && this.overrides.size() > 1) {
                for (int size = this.overrides.size() - 1; size > 0; size--) {
                    this.overrides.remove(size);
                }
            }
            updateViews();
        }
    }

    public void setShowDisableOption(boolean z10) {
        this.disableView.setVisibility(z10 ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        this.trackNameProvider = (TrackNameProvider) Assertions.checkNotNull(trackNameProvider);
        updateViews();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        setOrientation(1);
        this.overrides = new SparseArray<>();
        setSaveFromParentEnabled(false);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16843534});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        this.selectableItemBackgroundResourceId = resourceId;
        obtainStyledAttributes.recycle();
        LayoutInflater from = LayoutInflater.from(context);
        this.inflater = from;
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.trackGroups = TrackGroupArray.EMPTY;
        CheckedTextView checkedTextView = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.disableView = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(from.inflate(R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) from.inflate(17367055, (ViewGroup) this, false);
        this.defaultView = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }
}
