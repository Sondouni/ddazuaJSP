package exam;

import java.util.List;

public class Body {
    private List<Item> list;
    private int numOfRows;
    private int pageNo;
    private int totalCount;

    public List<Item> getList() {
        return list;
    }

    public void setList(List<Item> list) {
        this.list = list;
    }

    public int getNumOfRows() {
        return numOfRows;
    }

    public void setNumOfRows(int numOfRows) {
        this.numOfRows = numOfRows;
    }

    public int getPageNo() {
        return pageNo;
    }

    public void setPageNo(int pageNo) {
        this.pageNo = pageNo;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
