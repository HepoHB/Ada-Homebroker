package tech.ada.jjh.homebroker.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import tech.ada.jjh.homebroker.model.AppUser;
import tech.ada.jjh.homebroker.model.OrderType;

public class OrderDTORequest {
    @Size(min = 4, max = 7, message = "O Ticker deve ter entre 4 e 7 caracteres")
    @NotBlank(message = "O ticker da ação não pode estar em branco.")
    private String stockTicker;

    private Integer stockQuantity;

    private String userCpf;

    private OrderType type;

    private String userPassword;

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getStockTicker() {
        return stockTicker;
    }

    public void setStockTicker(String stockTicker) {
        this.stockTicker = stockTicker;
    }

    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String userCpf) {
        this.userCpf = userCpf;
    }

    public OrderType getType() {
        return type;
    }

    public void setType(OrderType type) {
        this.type = type;
    }
}
