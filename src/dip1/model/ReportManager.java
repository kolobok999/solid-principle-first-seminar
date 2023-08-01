package dip1.model;

import java.util.List;

public class ReportManager {
    private Reportable reportable;

    public ReportManager(Reportable reportable) {
        this.reportable = reportable;
    }

    public void PrintReport(List<ReportItem> items){
        reportable.output(items);
    }
}
