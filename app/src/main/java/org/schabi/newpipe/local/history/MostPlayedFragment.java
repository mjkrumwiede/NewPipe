package org.schabi.newpipe.local.history;

import org.schabi.newpipe.R;
import org.schabi.newpipe.database.stream.StreamStatisticsEntry;
import org.schabi.newpipe.local.history.StatisticsPlaylistFragment;

import java.util.Collections;
import java.util.List;

public final class MostPlayedFragment extends StatisticsPlaylistFragment {
    @Override
    protected String getName() {
        return getString(R.string.title_most_played);
    }

    @Override
    protected List<StreamStatisticsEntry> processResult(List<StreamStatisticsEntry> results)  {
        Collections.sort(results, (left, right) ->
                ((Long) right.watchCount).compareTo(left.watchCount));
        return results;
    }

}