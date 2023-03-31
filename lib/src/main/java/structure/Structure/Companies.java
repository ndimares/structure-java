/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package structure.Structure;

import java.net.http.HttpResponse;
import org.apache.http.NameValuePair;
import structure.Structure.utils.HTTPClient;
import structure.Structure.utils.HTTPRequest;
import structure.Structure.utils.SerializedBody;

/**
 * Companies
 */
public class Companies {
	
	private HTTPClient _defaultClient;
	private HTTPClient _securityClient;
	private String _serverUrl;
	private String _language;
	private String _sdkVersion;
	private String _genVersion;

	public Companies(HTTPClient defaultClient, HTTPClient securityClient, String serverUrl, String language, String sdkVersion, String genVersion) {
		this._defaultClient = defaultClient;
		this._securityClient = securityClient;
		this._serverUrl = serverUrl;
		this._language = language;
		this._sdkVersion = sdkVersion;
		this._genVersion = genVersion;
	}

    /**
     * Enrich a company profile
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.EnrichCompanyResponse enrich(structure.Structure.models.operations.EnrichCompanyRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/companies/enrich");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = structure.Structure.utils.Utils.getQueryParams(structure.Structure.models.operations.EnrichCompanyRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.EnrichCompanyResponse res = new structure.Structure.models.operations.EnrichCompanyResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404 || httpRes.statusCode() == 422) {
        }

        return res;
    }

    /**
     * List company employees
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.ListEmployeesResponse listEmployees(structure.Structure.models.operations.ListEmployeesRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(structure.Structure.models.operations.ListEmployeesRequest.class, baseUrl, "/companies/{id}/employees", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = structure.Structure.utils.Utils.getQueryParams(structure.Structure.models.operations.ListEmployeesRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.ListEmployeesResponse res = new structure.Structure.models.operations.ListEmployeesResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * List company jobs
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.ListJobsResponse listJobs(structure.Structure.models.operations.ListJobsRequest request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(structure.Structure.models.operations.ListJobsRequest.class, baseUrl, "/companies/{id}/jobs", request, null);
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("GET");
        req.setURL(url);
        
        java.util.List<NameValuePair> queryParams = structure.Structure.utils.Utils.getQueryParams(structure.Structure.models.operations.ListJobsRequest.class, request, null);
        if (queryParams != null) {
            for (NameValuePair queryParam : queryParams) {
                req.addQueryParam(queryParam);
            }
        }
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.ListJobsResponse res = new structure.Structure.models.operations.ListJobsResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403 || httpRes.statusCode() == 404) {
        }

        return res;
    }

    /**
     * Search Companies
     * @param request the request object containing all of the parameters for the API call
     * @return the response from the API call
     * @throws Exception if the API call fails
     */
    public structure.Structure.models.operations.SearchCompaniesResponse search(structure.Structure.models.operations.SearchCompaniesApplicationJSON request) throws Exception {
        String baseUrl = this._serverUrl;
        String url = structure.Structure.utils.Utils.generateURL(baseUrl, "/companies/search");
        
        HTTPRequest req = new HTTPRequest();
        req.setMethod("POST");
        req.setURL(url);
        SerializedBody serializedRequestBody = structure.Structure.utils.Utils.serializeRequestBody(request, "request", "json");
        req.setBody(serializedRequestBody);
        
        
        HTTPClient client = this._securityClient;
        
        HttpResponse<byte[]> httpRes = client.send(req);

        String contentType = httpRes.headers().firstValue("Content-Type").orElse("application/octet-stream");

        structure.Structure.models.operations.SearchCompaniesResponse res = new structure.Structure.models.operations.SearchCompaniesResponse() {{
            body = null;
        }};
        res.statusCode = httpRes.statusCode();
        res.contentType = contentType;
        res.rawResponse = httpRes;
        
        if (httpRes.statusCode() == 200) {
            if (structure.Structure.utils.Utils.matchContentType(contentType, "*/*")) {
                byte[] out = httpRes.body();
                res.body = out;
            }
        }
        else if (httpRes.statusCode() == 401 || httpRes.statusCode() == 403) {
        }

        return res;
    }
}