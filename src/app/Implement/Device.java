package app.Implement;

import app.Interface.Printer;

public class Device implements Printer {
    public static class Message {
        private String tex;
        private String sender;

        public Message(String sender, String tex) {
            this.sender = sender;
            this.tex = tex;
        }

        public String getTex() {
            return tex;
        }

        public void setTex(String tex) {
            this.tex = tex;
        }

        public String getSender() {
            return sender;
        }

        public void setSender(String sender) {
            this.sender = sender;
        }
    }

    @Override
    public void print(Message message) {
        if (message.sender == null && message.tex != null) {
            System.out.printf("Анонімний користувач відправив повідомлення:<%s>\n", message.tex);
        } else if (message.sender != null && message.tex != null) {
            System.out.printf("Користувач <%s> відправив повідомлення: <%s>\n",
                    message.sender, message.tex);
        } else if (message.sender == null) {
            Printer pr = new Printer() {
                @Override
                public void print(Message message) {
                    System.out.println("Опрацьовується пусте " +
                            "повідомлення від анонімного користувача...");
                }
            };
            pr.print(message);


        }


    }
}
