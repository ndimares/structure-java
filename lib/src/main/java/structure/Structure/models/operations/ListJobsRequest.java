/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import structure.Structure.utils.SpeakeasyMetadata;

public class ListJobsRequest {
    /**
     * ID of the company
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;
    public ListJobsRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * The offset number to start at
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=offset")
    public String offset;
    public ListJobsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }
    
    /**
     * Number of results per page (0-100)
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=per_page")
    public String perPage;
    public ListJobsRequest withPerPage(String perPage) {
        this.perPage = perPage;
        return this;
    }
    
}
