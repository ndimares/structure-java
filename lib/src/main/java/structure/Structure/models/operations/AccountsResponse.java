/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure.models.operations;

import java.net.http.HttpResponse;

public class AccountsResponse {
    
    public byte[] body;
    public AccountsResponse withBody(byte[] body) {
        this.body = body;
        return this;
    }
    
    
    public String contentType;
    public AccountsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;
    public AccountsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;
    public AccountsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
}
